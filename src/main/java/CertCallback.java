import com.sun.jna.platform.win32.WinCrypt;
import com.sun.jna.platform.win32.WinDef;

public class CertCallback implements Cryptdlg.FncmFilterProcCallback {

    final String szOID_KEY_USAGE = "2.5.29.15";

    @Override
    public boolean callback(WinCrypt.CERT_CONTEXT pCertContext, WinDef.LPARAM lCustData, int dwFlags, int dwDisplayWell) {

        for (int i = 0; i < pCertContext.pCertInfo.cExtension; i++) {

            // return true if the the attribute contains "2.5.29.15".
            if (pCertContext.pCertInfo.getRgExtension()[i].pszObjId.equals(szOID_KEY_USAGE)) {

                return true;
            }
        }

        return false;
    }
}

import com.sun.jna.platform.win32.WinCrypt;
import com.sun.jna.platform.win32.WinDef;

public class CertCallback implements Cryptdlg.FncmFilterProcCallback {

    @Override
    public boolean callback(WinCrypt.CERT_CONTEXT pCertContext, WinDef.LPARAM lCustData, int dwFlags, int dwDisplayWell) {
        return true;
    }
}

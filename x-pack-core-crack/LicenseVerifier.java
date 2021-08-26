package org.elasticsearch.license;

// import java.io.ByteArrayOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.nio.ByteBuffer;
// import java.security.InvalidKeyException;
// import java.security.NoSuchAlgorithmException;
// import java.security.Signature;
// import java.security.SignatureException;
// import java.util.Arrays;
// import java.util.Base64;
// import java.util.Collections;
// import org.apache.lucene.util.BytesRef;
// import org.apache.lucene.util.BytesRefIterator;
// import org.elasticsearch.common.bytes.BytesReference;
// import org.elasticsearch.common.xcontent.ToXContent;
// import org.elasticsearch.common.xcontent.XContentBuilder;
// import org.elasticsearch.common.xcontent.XContentFactory;
// import org.elasticsearch.common.xcontent.XContentType;
// import org.elasticsearch.core.internal.io.Streams;

public class LicenseVerifier {
    public static boolean verifyLicense(License license, byte[] publicKeyData) {
        return true;
        // Exception e;
        // try {
        //     ByteBuffer byteBuffer = ByteBuffer.wrap(Base64.getDecoder().decode(license.signature()));
        //     byteBuffer.getInt();
        //     byteBuffer.get(new byte[byteBuffer.getInt()]);
        //     byteBuffer.get(new byte[byteBuffer.getInt()]);
        //     byte[] signedContent = new byte[byteBuffer.getInt()];
        //     byteBuffer.get(signedContent);
        //     XContentBuilder contentBuilder = XContentFactory.contentBuilder(XContentType.JSON);
        //     license.toXContent(contentBuilder, new ToXContent.MapParams(Collections.singletonMap(License.LICENSE_SPEC_VIEW_MODE, "true")));
        //     Signature rsa = Signature.getInstance("SHA512withRSA");
        //     rsa.initVerify(CryptUtils.readPublicKey(publicKeyData));
        //     BytesRefIterator iterator = BytesReference.bytes(contentBuilder).iterator();
        //     while (true) {
        //         BytesRef ref = iterator.next();
        //         if (ref == null) {
        //             break;
        //         }
        //         rsa.update(ref.bytes, ref.offset, ref.length);
        //     }
        //     boolean verify = rsa.verify(signedContent);
        //     if (signedContent != null) {
        //         Arrays.fill(signedContent, (byte) 0);
        //     }
        //     return verify;
        // } catch (IOException e2) {
        //     e = e2;
        //     try {
        //         throw new IllegalStateException(e);
        //     } catch (Throwable th) {
        //         if (0 != 0) {
        //             Arrays.fill((byte[]) null, (byte) 0);
        //         }
        //         throw th;
        //     }
        // } catch (NoSuchAlgorithmException e3) {
        //     e = e3;
        //     throw new IllegalStateException(e);
        // } catch (SignatureException e4) {
        //     e = e4;
        //     throw new IllegalStateException(e);
        // } catch (InvalidKeyException e5) {
        //     e = e5;
        //     throw new IllegalStateException(e);
        // }
    }

    public static boolean verifyLicense(License license) {
        return true;
        // try {
        //     InputStream is = LicenseVerifier.class.getResourceAsStream("/public.key");
        //     try {
        //         ByteArrayOutputStream out = new ByteArrayOutputStream();
        //         Streams.copy(is, out);
        //         byte[] publicKeyBytes = out.toByteArray();
        //         if (is != null) {
        //             is.close();
        //         }
        //         return verifyLicense(license, publicKeyBytes);
        //     } catch (Throwable th) {
        //         th.addSuppressed(th);
        //     }
        //     throw th;
        // } catch (IOException ex) {
        //     throw new IllegalStateException(ex);
        // }
    }
}
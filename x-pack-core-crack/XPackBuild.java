package org.elasticsearch.xpack.core;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.elasticsearch.common.SuppressForbidden;
import org.elasticsearch.common.io.PathUtils;

/* loaded from: /var/folders/7l/x862vz5x0xd5blw07jx1trlr0000gp/T/jadx-4853855839517833413/classes.dex */
public class XPackBuild {
    public static final XPackBuild CURRENT;
    private String date;
    private String shortHash;

    static {
        String shortHash;
        String date;
        Path path = getElasticsearchCodebase();
        // if (path.toString().endsWith(".jar")) {
        //     try {
        //         JarInputStream jar = new JarInputStream(Files.newInputStream(path, new OpenOption[0]));
        //         try {
        //             Manifest manifest = jar.getManifest();
        //             shortHash = manifest.getMainAttributes().getValue("Change");
        //             date = manifest.getMainAttributes().getValue("Build-Date");
        //             jar.close();
        //         } catch (Throwable th) {
        //             th.addSuppressed(th);
        //         }
        //     } catch (IOException e) {
        //         throw new RuntimeException(e);
        //     }
        // } else {
        //     shortHash = "Unknown";
        //     date = "Unknown";
        // }
        // CURRENT = new XPackBuild(shortHash, date);
        // return;
        // throw th;
        CURRENT = new XPackBuild("Unknown", "Unknown");
    }

    @SuppressForbidden(reason = "looks up path of xpack.jar directly")
    static Path getElasticsearchCodebase() {
        try {
            return PathUtils.get(XPackBuild.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        } catch (URISyntaxException bogus) {
            throw new RuntimeException(bogus);
        }
    }

    XPackBuild(String shortHash, String date) {
        this.shortHash = shortHash;
        this.date = date;
    }

    public String shortHash() {
        return this.shortHash;
    }

    public String date() {
        return this.date;
    }
}
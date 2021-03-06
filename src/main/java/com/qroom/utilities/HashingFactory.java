package com.qroom.utilities;

import org.apache.commons.codec.digest.DigestUtils;

public class HashingFactory {
    public static Hashing getHashing(String str) {
        return () -> DigestUtils.sha256Hex(str);
    }
}

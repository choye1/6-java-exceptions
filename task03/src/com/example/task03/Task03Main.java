package com.example.task03;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;

import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (Exception e) {
            //ignore
        }
    }

    public static void throwCheckedException() throws IOException {
        throw new IOException("checked");
    }
}
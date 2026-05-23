package dev.Rignu1503.estructurales.adapter.interfaces;

public interface IStorageService {
    void upload(String path, byte[] data);
    byte[] download(String path);
    void delete(String path);
}
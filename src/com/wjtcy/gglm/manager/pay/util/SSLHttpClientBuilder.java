package com.wjtcy.gglm.manager.pay.util;



import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyStore;


public class SSLHttpClientBuilder {


    /** 允许的协议 */
    private String[] supportedProtocols = new String[] { "TLSv1" };

    /** 加密证书 */
    private InputStream keyStoreInputStream;

    /** 加密秘钥 */
    private String keyStorePassword ;

    /** 加密类型 */
    private String keyStoreType = KeyStore.getDefaultType();

    /** 信任密码 */
    private String trustStorePassword;
    /** 信任证书 */
    private InputStream trustStoreInputStream;
    /** 信任证书类型 */
    private String trustStoreType;

    public static SSLHttpClientBuilder create(){
        return new SSLHttpClientBuilder();
    }

    private SSLHttpClientBuilder() {

    }


    /**
     * 设置加密证书
     * @param keyStoreBytes
     * @return
     */
    public final SSLHttpClientBuilder setKeyStore( final byte[] keyStoreBytes){
        this.keyStoreInputStream = new ByteArrayInputStream(keyStoreBytes);
        return this;
    }

    /**
     * 设置加密证书
     * @param keyStoreInputStream
     * @return
     */
    public final SSLHttpClientBuilder setKeyStore( InputStream keyStoreInputStream){
        this.keyStoreInputStream = keyStoreInputStream;
        return this;
    }

    /**
     * 设置信任证书
     * @param trustStoreInputStream
     * @return
     */
    public final SSLHttpClientBuilder setTrustStore( InputStream trustStoreInputStream){
        this.trustStoreInputStream = trustStoreInputStream;
        return this;
    }

    /**
     * 设置允许的协议
     * @param supportedProtocols
     * @return
     */
    public final SSLHttpClientBuilder setSupportedProtocols(final String[] supportedProtocols){
        this.supportedProtocols = supportedProtocols;
        return this;
    }


    /**
     * 设置加密秘钥
     * @param keyStorePassword
     * @return
     */
    public final SSLHttpClientBuilder setKeyStorePassword(final String keyStorePassword){
        this.keyStorePassword = keyStorePassword;
        return this;
    }


    /**
     * 设置加密证书类型
     * @param keyStoreType
     */
    public final SSLHttpClientBuilder setKeyStoreType(String keyStoreType) {
        this.keyStoreType = keyStoreType;
        return this;
    }

    /**
     * 设置信任秘钥
     * @param trustStorePassword
     * @return
     */
    public final SSLHttpClientBuilder setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
        return this;
    }

    /**
     * 设置信任证书类型
     * @param trustStoreType
     */
    public final SSLHttpClientBuilder setTrustStoreType(String trustStoreType) {
        this.trustStoreType = trustStoreType;
        return this;
    }

    /**
     * 设置信任证书
     * @param trustStoreBytes
     * @return
     */
    public final SSLHttpClientBuilder setTrustStore( final byte[] trustStoreBytes){
        this.trustStoreInputStream = new ByteArrayInputStream(trustStoreBytes);
        return this;
    }

 
}

package ch.zli.m223.punchclock.config;

/**
 * The type Security constants.
 */
public class SecurityConstants {
    /**
     * The constant SECRET.
     */
    public static final String SECRET = "SecretKeyToGenJWTs";
    /**
     * The constant EXPIRATION_TIME.
     */
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    /**
     * The constant TOKEN_PREFIX.
     */
    public static final String TOKEN_PREFIX = "Bearer ";
    /**
     * The constant HEADER_STRING.
     */
    public static final String HEADER_STRING = "Authorization";
    /**
     * The constant SIGN_UP_URL.
     */
    public static final String SIGN_UP_URL = "/users/sign-up";
    /**
     * The constant LOG_IN_URL.
     */
    public static final String LOG_IN_URL = "/login";
}
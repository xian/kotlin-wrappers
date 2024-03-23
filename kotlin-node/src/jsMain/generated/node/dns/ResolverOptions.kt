// Generated by Karakum - do not modify it manually!


package node.dns


sealed external interface ResolverOptions {
    /**
     * Query timeout in milliseconds, or `-1` to use the default timeout.
     */
    var timeout: Double?

    /**
     * The number of tries the resolver will try contacting each name server before giving up.
     * @default 4
     */
    var tries: Double?
}

@file:JsModule("node:tls")

package node.tls


/**
 * Returns an array with the names of the supported TLS ciphers. The names are
 * lower-case for historical reasons, but must be uppercased to be used in
 * the `ciphers` option of {@link createSecureContext}.
 *
 * Not all supported ciphers are enabled by default. See `Modifying the default TLS cipher suite`.
 *
 * Cipher names that start with `'tls_'` are for TLSv1.3, all the others are for
 * TLSv1.2 and below.
 *
 * ```js
 * console.log(tls.getCiphers()); // ['aes128-gcm-sha256', 'aes128-sha', ...]
 * ```
 * @since v0.10.2
 */
external fun getCiphers(): js.core.ReadonlyArray<String>

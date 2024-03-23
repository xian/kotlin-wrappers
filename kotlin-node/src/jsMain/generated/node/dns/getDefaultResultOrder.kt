// Generated by Karakum - do not modify it manually!

@file:JsModule("node:dns")

package node.dns


/**
 * Get the default value for `verbatim` in {@link lookup} and [`dnsPromises.lookup()`](https://nodejs.org/docs/latest-v20.x/api/dns.html#dnspromiseslookuphostname-options).
 * The value could be:
 *
 * * `ipv4first`: for `verbatim` defaulting to `false`.
 * * `verbatim`: for `verbatim` defaulting to `true`.
 * @since v18.17.0
 */
external fun getDefaultResultOrder(): GetDefaultResultOrderResult

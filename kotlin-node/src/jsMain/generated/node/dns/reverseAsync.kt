// Generated by Karakum - do not modify it manually!

@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
 * array of host names.
 *
 * On error, the `Promise` is rejected with an [`Error`](https://nodejs.org/docs/latest-v20.x/api/errors.html#class-error) object, where `err.code`
 * is one of the [DNS error codes](https://nodejs.org/docs/latest-v20.x/api/dns.html#error-codes).
 * @since v10.6.0
 */

@JsName("reverse")
external fun reverseAsync(ip: String): Promise<js.array.ReadonlyArray<String>>

package node.dns

import js.promise.await


suspend fun resolve6(hostname: String): js.core.ReadonlyArray<String> =
    resolve6Async(
        hostname
    ).await()


suspend fun resolve6(hostname: String, options: ResolveWithTtlOptions): js.core.ReadonlyArray<RecordWithTtl> =
    resolve6Async(
        hostname, options
    ).await()


suspend fun resolve6(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
    resolve6Async(
        hostname, options
    ).await()

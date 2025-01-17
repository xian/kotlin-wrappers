package node.dns

import js.promise.await


suspend fun lookup(hostname: String, family: Double): LookupAddress =
    lookupAsync(
        hostname, family
    ).await()


suspend fun lookup(hostname: String, options: LookupOneOptions): LookupAddress =
    lookupAsync(
        hostname, options
    ).await()


suspend fun lookup(hostname: String, options: LookupAllOptions): js.core.ReadonlyArray<LookupAddress> =
    lookupAsync(
        hostname, options
    ).await()


suspend fun lookup(hostname: String, options: LookupOptions): Any /* LookupAddress | LookupAddress[] */ =
    lookupAsync(
        hostname, options
    ).await()


suspend fun lookup(hostname: String): LookupAddress =
    lookupAsync(
        hostname
    ).await()

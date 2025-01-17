package node.dns

import js.promise.await


suspend fun resolvePtr(hostname: String): js.core.ReadonlyArray<String> =
    resolvePtrAsync(
        hostname
    ).await()

package node.dns

import js.promise.await


suspend fun resolveTxt(hostname: String): js.core.ReadonlyArray<js.core.ReadonlyArray<String>> =
    resolveTxtAsync(
        hostname
    ).await()

@file:JsModule("react-router")

package react.router

import remix.run.router.Path
import remix.run.router.To

/**
 * Resolves the pathname of the given `to` value against the current location.
 *
 * @see https://reactrouter.com/hooks/use-resolved-path
 */
external fun useResolvedPath(to: To, options: UseResolvedPathOptions = definedExternally): Path

@file:JsModule("react-router")

package react.router

import remix.run.router.UIMatch

/**
 * Returns the active route matches, useful for accessing loaderData for
 * parent/child routes or the route "handle" property
 */
external fun useMatches(): js.core.ReadonlyArray<UIMatch<*, *>>

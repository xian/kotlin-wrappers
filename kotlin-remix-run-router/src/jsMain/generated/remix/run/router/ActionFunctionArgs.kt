package remix.run.router


/**
 * Arguments passed to action functions
 */

sealed external interface ActionFunctionArgs<Context /* default is Any? */> : DataFunctionArgs<Context>

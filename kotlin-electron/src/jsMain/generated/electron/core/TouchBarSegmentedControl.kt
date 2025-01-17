@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarSegmentedControl : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
    /**
     * TouchBarSegmentedControl
     */
    constructor (options: TouchBarSegmentedControlConstructorOptions)

    /**
     * A `string` representing the current selection mode of the control.  Can be
     * `single`, `multiple` or `buttons`.
     */
    var mode: (TouchBarSegmentedControlMode)

    /**
     * A `SegmentedControlSegment[]` array representing the segments in this control.
     * Updating this value immediately updates the control in the touch bar. Updating
     * deep properties inside this array **does not update the touch bar**.
     */
    var segments: js.core.ReadonlyArray<SegmentedControlSegment>

    /**
     * A `string` representing the controls current segment style. Updating this value
     * immediately updates the control in the touch bar.
     */
    var segmentStyle: String

    /**
     * An `Integer` representing the currently selected segment. Changing this value
     * immediately updates the control in the touch bar. User interaction with the
     * touch bar will update this value automatically.
     */
    var selectedIndex: Double
}

import * as main_component from "../main.component"

// @ponicode
describe("main_component.MainComponent.changeExpand", () => {
    let inst4: any
    let inst3: any
    let inst: any
    let inst2: any

    beforeEach(() => {
        inst4 = new main_component.MainComponent()
        inst3 = new main_component.MainComponent()
        inst = new main_component.MainComponent()
        inst2 = new main_component.MainComponent()
    })

    test("0", () => {
        let result: any = inst2.changeExpand("03ea49f8-1d96-4cd0-b279-0684e3eec3a9")
        expect(result).toBe(null)
    })
})

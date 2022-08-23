import * as training_service from "../training.service"
import * as http from "@angular/common/http"

// @ponicode
describe("training_service.TrainingService.getTrainings", () => {
    let inst19: any
    let inst20: any
    let inst21: any
    let inst16: any
    let inst17: any
    let inst18: any
    let inst13: any
    let inst14: any
    let inst15: any
    let inst10: any
    let inst11: any
    let inst12: any
    let inst7: any
    let inst8: any
    let inst9: any
    let inst: any
    let inst5: any
    let inst6: any
    let inst2: any
    let inst3: any
    let inst4: any

    beforeEach(() => {
        inst19 = new http.HttpHandler()
        inst20 = new http.HttpClient(inst19)
        inst21 = new training_service.TrainingService(inst20)
        inst16 = new http.HttpHandler()
        inst17 = new http.HttpClient(inst16)
        inst18 = new training_service.TrainingService(inst17)
        inst13 = new http.HttpHandler()
        inst14 = new http.HttpClient(inst13)
        inst15 = new training_service.TrainingService(inst14)
        inst10 = new http.HttpHandler()
        inst11 = new http.HttpClient(inst10)
        inst12 = new training_service.TrainingService(inst11)
        inst7 = new http.HttpHandler()
        inst8 = new http.HttpClient(inst7)
        inst9 = new training_service.TrainingService(inst8)
        inst = new http.HttpHandler()
        inst5 = new http.HttpClient(inst)
        inst6 = new training_service.TrainingService(inst5)
        inst2 = new http.HttpHandler()
        inst3 = new http.HttpClient(inst2)
        inst4 = new training_service.TrainingService(inst3)
    })

    test("0", () => {
        inst4.getTrainings(1)
    })

    test("1", () => {
        inst9.getTrainings(-5.48)
    })

    test("2", () => {
        inst21.getTrainings(100)
    })

    test("3", () => {
        inst21.getTrainings(-100)
    })

    test("4", () => {
        inst21.getTrainings(NaN)
    })

    test("5", () => {
        inst21.getTrainings(-Infinity)
    })

    test("6", () => {
        inst21.getTrainings(Infinity)
    })

    test("7", () => {
        inst21.getTrainings(20)
    })
})

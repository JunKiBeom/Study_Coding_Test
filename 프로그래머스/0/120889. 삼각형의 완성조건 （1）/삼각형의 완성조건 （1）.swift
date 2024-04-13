import Foundation

func solution(_ sides:[Int]) -> Int {
    let tmp = sides.sorted()
    return tmp[0]+tmp[1]>tmp[2] ? 1 : 2
}
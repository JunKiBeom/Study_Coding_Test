import Foundation

func solution(_ array:[Int]) -> Int {
    var dict = [Int: Int]()

    for a in array {
        if dict[a] == nil {
            dict[a] = 1
        } else {
            dict[a]! += 1
        }
    }

    let max = dict.values.sorted{ $0 > $1 }.first
    let fil = dict.filter{ $0.value == max }

    return fil.count == 1 ? fil.first!.key : -1
}
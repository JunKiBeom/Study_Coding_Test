import Foundation

let n = readLine()!.components(separatedBy: [" "]).map { Int($0)! }
for i in 1...n[0] {
    for j in 1...i {
        print("*", terminator: "")
    }
    print()
}
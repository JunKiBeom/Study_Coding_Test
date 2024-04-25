import Foundation

func solution(_ numbers:[Int], _ direction:String) -> [Int] {
    var num = numbers
    
    if direction == "right" {
        let tmp = num.removeLast()
        return [tmp] + num
    }
    else {
        let tmp = num.removeFirst()
        return num + [tmp]
    }
}
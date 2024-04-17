import Foundation

func solution(_ numer1:Int, _ denom1:Int, _ numer2:Int, _ denom2:Int) -> [Int] {
    var num3 = (numer1 * denom2) + (numer2 * denom1)
    var den3 = denom1 * denom2
    
    for i in stride(from: num3, to: 0, by: -1) {
        if (num3 % i == 0 && den3 % i == 0) {
            num3 /= i
            den3 /= i
        }
    }
    return [num3, den3]
}
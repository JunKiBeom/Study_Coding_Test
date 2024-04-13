import Foundation

func solution(_ price:Int) -> Int {
    var pr = price/10000
    switch pr {
    case 50...:
        return Int(Double(price)*0.8)
    case 30..<50:
        return Int(Double(price)*0.9)
    case 10..<30:
        return Int(Double(price)*0.95)
    default:
        return price
    }
}
package horstman.example
object valIIN extends App {


  def validate_iin(iin: String): AnyVal =  {
    var count = 0
    var k = 0
    var k2 = 0
    for (i <- 0 to 9) {
      println(f"$i  ${iin(i)}")
      count += i * iin(i)
    }
    k = count % 11
    println(f"Контрольный разряд=${iin(11)}")
    println(f"Остаток от деления на 11=$k")
    if (k == 10){
      for (i <- 1 to 10) {
        var count2 = 0
        var t = (i + 3) % 11
        if (t == 0) t = 11
        count2 += t * iin(i)
      }
      k2 = count % 11
      if  (k2 == 10)  {
        return false
      }
      println("Контрольный разряд=" + iin(11))
      println("Остаток от деления на 11=" + k2.toString)
      return k2 == iin(11)
    }
      return k == iin(11)

  }


  def get_info(iin:String) = {
    var vek = 0
    var gender = ""
    if (iin.length != 12) print("Длина иин некорректна")

    var year = iin.slice(0, 2)
    var mounth = iin.slice(2, 4)
    var day = iin.slice(4, 6)
    var vek_pol_num = iin.slice(6, 7)

    if (vek_pol_num.toInt % 2 == 0){
      gender = "Женский"
    }else{
      gender = "Мужской"
    }

    if (vek_pol_num.toInt == 1 || vek_pol_num.toInt == 2){
      vek = 19
    }else if (vek_pol_num.toInt == 3 || vek_pol_num.toInt == 4){
      vek = 20
    }else if (vek_pol_num.toInt == 5 || vek_pol_num.toInt == 6){
      vek = 21
    } else {
       println("Неверный век/пол (7 символ в ИИН)")
    }

    var birthday = {vek - 1}+year + '-' +mounth + "-" + day
    var result = f"birthday:  $birthday, gender: $gender, is_valid: ${validate_iin(iin).toString}"
    println(result)
  }
  get_info("000715550531")
}


@main def main(): Unit = {
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	print("Enter a String: ")
	val string = scala.io.StdIn.readLine()
	println(s"You entered: $string")

	//lambda functions to encrypt and decrypt
	val encryption: (Char, Int, String)=> Char = (c, key, a) => {
		a((a.indexOf(c.toUpper)+key)%a.size)
	}

	val decryption: (Char, Int, String)=> Char = (c, key, a) => {
		a((a.indexOf(c.toUpper)-key)%a.size)
	}

	val cp = cipher(encryption, string, 5, alphabet)
	println(s"Encripted string: $cp")

	val dp = cipher(decryption, cp, 5, alphabet)
	println(s"Decrypted string: $dp")
}

def cipher(algo: (Char, Int, String)=>Char, str: String, key: Int, alp: String ): String = {
	str.map(algo(_, key, alp))
}

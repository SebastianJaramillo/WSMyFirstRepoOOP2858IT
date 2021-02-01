class Chef
	def initialize()
		@name 
		@identificationcard
		@age
		@cellPhone
	end  

	def registerChef()
		puts "\nRegister Chef"
		puts "*******************"
		puts "Enter name:"
		name = gets
		puts "Enter ID:"
		identificationcard = gets
		puts "Enter age:"
		age = gets
		puts "Enter phone number:"
		cellPhone = gets
		
		print "\n"
		print "============================"
		print "\n"
		print "Your name is: " + name
		print "Your ID is: " + identificationcard
		print "Your age is: " + age
		print "Your phone number is: " + cellPhone
	end
end
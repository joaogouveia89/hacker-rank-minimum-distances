require 'colorize'
require './minimum_distances'

#input parsing and reading
input00 = File.open("../../test-cases/input/input00.txt")
input01 = File.open("../../test-cases/input/input01.txt")

data = input00.map(&:chomp)

a00 = data[1].split(" ").map(&:to_i)

data = input01.map(&:chomp)

a01 = data[1].split(" ").map(&:to_i)

# problem application
start = Time.now
response00 = minimum_distances a00
response01 = minimum_distances a01
finish = Time.now

puts("solved all the test cases in " + (1000 * (finish - start)).round(2).to_s + "ms")

#expected outputs
start = Time.now
output00File = File.open("../../test-cases/output/output00.txt")
output01File = File.open("../../test-cases/output/output01.txt")

data = output00File.map(&:chomp)
output00 = data[0].to_i

data = output01File.map(&:chomp)
output01 = data[0].to_i

if response00 === output00
	puts "INPUT 00".green
else
	puts "INPUT 00".red
end

if response01 === output01
	puts "INPUT 01".green
else
	puts "INPUT 01".red
end
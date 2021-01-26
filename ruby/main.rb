

domains = {
  :location => "United States"
}

domains = {
  'de' => "Germany", 1 => "Slovakia", :us => "United States"
}

def print_name
  p "type name"
  name = gets.chomp
  p "Hi, #{name}!"
end


num_strings = ['one', 'two', 'three']

nums = [5, 5, 6, 7, 2, 4, 3, 2, 1, 9, 7, 6, 0, 0, 35, 19, 66, 3, 22, 21, 4, 4, 4, 0, 1, 2, 3, 4, 12, 15]



# num_strings.each do |str|
#   p "the value is #{str}"
# end

# num_strings.each { |str|
#   p "the value is #{str}"
# }

# p [1,2,3].map { |e| e * 2 }


# p [1,2,3,4,5].select { |i| i > 3 } #returns [4,5]

adjective = "Big Bad"

# p "Hello, #{adjective} World"

# p nums
enumerable = nums.reject { |n|
  n%3 == 0
}
# p enumerable

book = {
  :title=>"The Great Gatsby",
  :author=>"F Scott Fitzgerald",
  :year=>1925,
  :price=>10
}

lamp = {
  type: 'reading',
  brand: 'Ikea',
  price: 25
}

table = {
  type: 'bed side',
  brand: 'Crate & Barrel',
  color: 'birch',
  price: 50
}



def euler(int)

  array = (1...int).select { |n|
    n % 5 == 0 || n % 3 == 0
  }

  p array.sum

end



def reverse_str(str)

  rev=[]
  index = str.length - 1

  while index >= 0
    rev.push(str[index])
    index -= 1
  end

  p rev.join

end

def swap_en

  a, b = 34, 6567
  p "a is #{a}, b is #{b}"

  puts "\n"

  a, b = b, a
  p "a is #{a}, b is #{b}"

end

def multiply_array
  prdt = 1
  [1,2,3,4].each { |n|
    prdt *= n
  }
  p prdt
end


class World

  attr_reader :people
  attr_accessor :name

  def initialize name
    @name = name
    @people = []
  end

  # def name
  #   @name
  # end
  #
  # def name=value
  #   @name = value
  # end

  def people
    @people
  end

  def populate name, age
    @people <<  {name: name, age: age}
  end
end

# world1 = World.new("Krypton")
# world1.populate("Kal-El", 33)
# world1.populate("Darth Vader", 40)
# p world1.name
# p world1.people[1]


planets = %w(Mercury Venus Earth Mars Jupiter Saturn Uranus Pluto)

milky_way = planets.map { |pln|
  World.new(pln)
}

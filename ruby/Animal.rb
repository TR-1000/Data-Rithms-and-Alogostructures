class Animal
  attr_reader :age

  def initialize
    @age = 0
  end

  def get_older
    @age += 1
  end

end

class Cat < Animal

  def sound
    'meow'
  end

end

dax = Animal.new

dax.get_older
dax.get_older
dax.get_older

garfield = Cat.new

p garfield.sound

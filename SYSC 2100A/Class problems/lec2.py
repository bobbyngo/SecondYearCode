"""#Ex1   
def print_point (point):
    
    print("({0}, {1})".format (point[0], point[1]));

#Ex2
def add_points(point1,point2):
    
    new_point = [0,0]
    new_point[0] = point1[0] + point2[0]
    new_point[1] = point1[1] + point2[1]
    
    return new_point;
    
    
point1 = [3,4] 
point2 = [5,2] 
print_point(point1)
print_point(point2)

print (add_points(point1,point2))

#Approaches using dict

def print_point1(point):
    
    print("({0}, {1})".format (point["x"], point["y"]));
    
def add_points1(point3,point4):
    
    return {"x": point3["x"] + point4["x"], 
            "y":point3["y"] + point4["y"]};


print("\n")
point3= {"x":3,"y":4}
point4= {"x":5,"y":2}
print_point1(point3)
print_point1(point4)

print (add_points1(point3,point4))"""

class Point:
    """Represent 2D point """
    
#Ex1   
def print_point (point: Point) -> None:
    
    print("({0}, {1})".format (point.x, point.y));

#Ex2
def add_points(point1: Point,point2: Point) -> Point:
    
    sum = Point()
    sum.x = point1.x + point2.x
    sum.y = point1.y + point2.y
    
    return sum;
"""
point_1 = Point()
point_1.x = 3
point_1.y = 4

point_2 = Point()
point_2.x = 5
point_2.y = 2

sum = add_points (point_1, point_2)
print_point(sum)
"""
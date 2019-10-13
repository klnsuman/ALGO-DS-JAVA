# Description:
# This is the structure class for a patient record in the doubly linked list.
class PatientRecord(object):

    def __init__(self, age=None, name=None, pid=None, prev_node=None, next_node=None):
        self.patId = str(pid)
        self.name  = name
        self.age   = age
        self.next_node = next_node
        self.prev_node = prev_node
        
    def get_name(self):
        return self.name
    
    def get_age(self):
        return self.age
    
    def get_patId(self):
        return self.patId    

    def get_prev(self):
        return self.prev_node
    
    def get_next(self):
        return self.next_node

    def set_prev(self, new_prev):
        self.prev_node = new_prev    

    def set_next(self, new_next):
        self.next_node = new_next
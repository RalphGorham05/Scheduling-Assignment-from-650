class PCB:
	def __init__(self, id, et, at):
		self.pid = id
		self.pST = et
		self.pAT = at


with open('Simulation1-data.txt','r') as data:
	lines = [line.split() for line in data]


lines = [[int(e) for e in line] for line in lines]



processes = []
for line in lines:
	pcb = PCB(line[0],line[1],line[2])
	processes.append(pcb)





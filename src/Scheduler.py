import PCB

class Scheduler:
	def __init__(self):
		self.processes = []



	def addPCBs(self):
		with open('Simulation1-data.txt','r') as data:
			lines = [line.split() for line in data]


		lines = [[int(e) for e in line] for line in lines]
		print lines


		for line in lines:
			pcb = PCB(line[0],line[1],line[2])
			processes.append(pcb)



sched = Scheduler()
sched.addPCBs

for p in sched.processes:
	print p
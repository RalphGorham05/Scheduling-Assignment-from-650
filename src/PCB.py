class PCB:
	def __init__(self, id, et, at):
		self.pid = id
		self.pST = et
		self.pAT = at



p = PCB(1,30, 50)
print p.pST
print p.pAT
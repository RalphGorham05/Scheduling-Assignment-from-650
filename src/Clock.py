from time import sleep

class Clock:
	def __init__(self):
		self.startTime = 0
		self.stopTime = 50
		self.currentTime = 0
		self.status = ''

	def startClock(self):
		self.currentTime = 1
		self.status = 'running'

	'''
	def stopClock(self):
		self.status = 'stopped'
		self.stopTime = self.currentTime
	'''

	def runClock(self):
		while self.currentTime < self.stopTime:
			sleep(.1)
			self.currentTime += 1
		
			

			

c = Clock()

c.startClock()

c.runClock()

if c.status == 'running':
	print c.currentTime
	
else:
	print 'nope'









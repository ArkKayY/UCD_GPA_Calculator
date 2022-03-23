# UCD_GPA_Calculator
A spring-boot application that computes GPA on scale of 4.0 for UCD.

REST Endpoint: http://localhost:8080/compute-gpa

Sample JSON:
```json
[
	{
		"moduleName": "Distributed Systems",
		"credits": 5,
		"scores": [
			{
				"percentage": 20,
				"grade": "B+"
			},
			{
				"percentage": 40,
				"grade": "B"
			},
			{
				"percentage": 40,
				"grade": "A+"
			}
		]
	},
	{
		"moduleName": "Machine Learning",
		"credits": 5,
		"scores": [
			{
				"percentage": 20,
				"grade": "B+"
			},
			{
				"percentage": 20,
				"grade": "A-"
			},
			{
				"percentage": 60,
				"grade": "B+"
			}
		]
	},
	{
		"moduleName": "Cloud Computing",
		"credits": 10,
		"scores": [
			{
				"percentage": 30,
				"grade": "B+"
			},
			{
				"percentage": 30,
				"grade": "C"
			},
			{
				"percentage": 40,
				"grade": "A+"
			}
		]
	},
	{
		"moduleName": "Optimization",
		"credits": 5,
		"scores": [
			{
				"percentage": 40,
				"grade": "C+"
			},
			{
				"percentage": 30,
				"grade": "B-"
			},
			{
				"percentage": 30,
				"grade": "A+"
			}
		]
	},
	{
		"moduleName": "Information Architecture",
		"credits": 5,
		"scores": [
			{
				"percentage": 15,
				"grade": "D+"
			},
			{
				"percentage": 20,
				"grade": "A-"
			},
			{
				"percentage": 65,
				"grade": "C-"
			}
		]
	}
]

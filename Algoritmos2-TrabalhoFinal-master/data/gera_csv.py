#!/usr/bin/env python3

import json

with open("alunos.json","r") as f:
    for item in json.load(f):
        item['_id'] = item['_id'][8:16]
        print("{_id},{name},{email},{age},{gender},{company},{city}".format(**item))
    

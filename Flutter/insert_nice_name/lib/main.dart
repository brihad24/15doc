import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            appBar: AppBar(
              backgroundColor: Colors.green.shade900,
              title: const Text('Chats'),
            ),
            body: Column(children: [
              Stack(
                children: [
                  Container(
                    width: 1500,
                    height: 100,
                    decoration: BoxDecoration(
                      color: Colors.green.shade700,
                      border: Border.all(color: Colors.white, width: 1),
                    ),
                  ),

                  const Positioned(
                    child: Icon(
                      Icons.visibility_off,
                      color: Colors.white,
                    ),
                    top: 35,
                    left: 350,
                  ), //Icon

                  const Positioned(
                    child: Icon(
                      Icons.accessibility_new_rounded,
                      color: Colors.white,
                      size: 50,
                    ),
                    top: 20,
                    left: 14,
                  ),

                  const Positioned(
                    child: Text(
                      'Someone',
                      style: TextStyle(
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                          fontSize: 20),
                    ),
                    top: 18,
                    left: 75,
                  ), // Person Name

                  const Positioned(
                    child: Text(
                      'Waaassssuuuuupppppp',
                      style: TextStyle(color: Colors.white, fontSize: 13),
                    ),
                    top: 55,
                    left: 75,
                  ), // Tex from person
                ],
              ),
              Stack(
                children: [
                  Container(
                    width: 1500,
                    height: 100,
                    decoration: BoxDecoration(
                      color: Colors.green.shade600,
                      border: Border.all(color: Colors.white, width: 1),
                    ),
                  ),

                  const Positioned(
                    child: Icon(
                      Icons.visibility,
                      color: Colors.white,
                    ),
                    top: 35,
                    left: 350,
                  ), //Icon

                  const Positioned(
                    child: Icon(
                      Icons.ac_unit,
                      color: Colors.white,
                      size: 50,
                    ),
                    top: 20,
                    left: 14,
                  ),

                  const Positioned(
                    child: Text(
                      'Someone Else',
                      style: TextStyle(
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                          fontSize: 20),
                    ),
                    top: 18,
                    left: 75,
                  ), // Person Name

                  const Positioned(
                    child: Text(
                      'Wtffffffff',
                      style: TextStyle(color: Colors.white, fontSize: 13),
                    ),
                    top: 55,
                    left: 75,
                  ), // Tex from person
                ],
              ),
              Stack(
                children: [
                  Container(
                    width: 1500,
                    height: 100,
                    decoration: BoxDecoration(
                      color: Colors.green.shade600,
                      border: Border.all(color: Colors.white, width: 1),
                    ),
                  ),

                  const Positioned(
                    child: Icon(
                      Icons.visibility_off,
                      color: Colors.white,
                    ),
                    top: 35,
                    left: 350,
                  ), //Icon

                  const Positioned(
                    child: Icon(
                      Icons.accessible_sharp,
                      color: Colors.white,
                      size: 50,
                    ),
                    top: 20,
                    left: 14,
                  ),

                  const Positioned(
                    child: Text(
                      'Wheelchair',
                      style: TextStyle(
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                          fontSize: 20),
                    ),
                    top: 18,
                    left: 75,
                  ), // Person Name

                  const Positioned(
                    child: Text(
                      'I cant stand',
                      style: TextStyle(color: Colors.white, fontSize: 13),
                    ),
                    top: 55,
                    left: 75,
                  ), // Tex from person
                ],
              )
            ] //Children
                )));
  }
}

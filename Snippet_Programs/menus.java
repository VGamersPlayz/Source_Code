JMenuBar mb = new JMenuBar();
JMenu file = new JMenu("File");
file.add(new JMenuItem("New")); // no way to add
file.add(new JMenuItem("Open")); // listeners
mb.add(file);
JMenu edit = new JMenu("Edit");
edit.add(copy = new JMenuItem("Copy"));
edit.add(paste = new JMenuItem("Paste"));
edit.addSeparator();
edit.add(clear = new JMenuItem("Clear"));
mb.add(edit);
jf.setJMenuBar(mb); // assumes jf is a JFram

Create menu bar
menuBar =newJMenuBar();

Create Menu
menu =newJMenu("A Menu");

add menu to menu bar
menuBar.add(menu);

Create and add menuitem to the menu
menuItem =newJMenuItem("A text-only menu item",
                       KeyEvent.VK_T);
menu.add(menuItem);

Add a separator line
menu.addSeparator();

Create a radio button menu and add to menu
rbMenuItem =newJRadioButtonMenuItem("A radio buttonmenu item");
menu.add(rbMenuItem);

Create a check box menu and add to menu
cbMenuItem =newJCheckBoxMenuItem("A check box menuitem");
menu.add(cbMenuItem);

Add a mnemonic for keyboard selection of item
menuItem.setMnemonic(KeyEvent.VK_D);

Layout for Menu
menuBar.setLayout(newBoxLayout(menuBar,BoxLayout.PAGE_AXIS));

Border Type for Menu Bar
menuBar.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Color.BLACK));

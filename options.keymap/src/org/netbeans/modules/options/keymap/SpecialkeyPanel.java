/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2009 Sun Microsystems, Inc.
 */

/*
 * SpecialkeyPanel.java
 *
 * Created on Jan 13, 2009, 12:04:21 PM
 */

package org.netbeans.modules.options.keymap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Popup;

/**
 * Little keyboard offering special keys to add to shortcut input textfields
 * 
 * @author Max Sauer
 */
public class SpecialkeyPanel extends javax.swing.JPanel implements ActionListener {

    /** parent popup */
    private Popupable parent;
    private JTextField target;

    /** Creates new form SpecialkeyPanel */
    public SpecialkeyPanel(final Popupable parent, JTextField target) {
        this.parent = parent;
        this.target = target;
        initComponents();

        target.addFocusListener(new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {
                parent.hidePopup();
            }
        });

        downButton.addActionListener(this);
        enterButton.addActionListener(this);
        escButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        tabButton.addActionListener(this);
        upButton.addActionListener(this);
        wheelUpButton.addActionListener(this);
        wheelDownButton.addActionListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabButton = new javax.swing.JButton();
        escButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        wheelUpButton = new javax.swing.JButton();
        wheelDownButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabButton.setText("Tab"); // NOI18N

        escButton.setFont(new java.awt.Font("Lucida Grande", 0, 9)); // NOI18N
        escButton.setText("ESC"); // NOI18N
        escButton.setAlignmentY(0.0F);
        escButton.setIconTextGap(0);

        upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/options/keymap/up.png"))); // NOI18N
        upButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.upButton.text")); // NOI18N

        enterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/options/keymap/enter.png"))); // NOI18N
        enterButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.enterButton.text")); // NOI18N

        leftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/options/keymap/left.png"))); // NOI18N
        leftButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.leftButton.text_1")); // NOI18N

        downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/options/keymap/down.png"))); // NOI18N

        rightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/options/keymap/right.png"))); // NOI18N
        rightButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.rightButton.text")); // NOI18N

        wheelUpButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.wheelUpButton.text_1")); // NOI18N

        wheelDownButton.setText(org.openide.util.NbBundle.getMessage(SpecialkeyPanel.class, "SpecialkeyPanel.wheelDownButton.text_1")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(escButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wheelDownButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wheelUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {downButton, enterButton, escButton, leftButton, rightButton, upButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wheelUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wheelDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {downButton, enterButton, escButton, leftButton, rightButton, upButton});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton escButton;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton tabButton;
    private javax.swing.JButton upButton;
    private javax.swing.JButton wheelDownButton;
    private javax.swing.JButton wheelUpButton;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String text;
        final Object source = e.getSource();
        //someone clicked a button, hide popup and add text
        if ((source instanceof JButton) && parent != null) {
            parent.hidePopup();

            if (source == upButton) {
                text = "UP"; // NOI18N
            } else if (source == downButton) {
                text = "DOWN"; // NOI18N
            } else if (source == leftButton) {
                text = "LEFT"; // NOI18N
            } else if (source == rightButton) {
                text = "RIGHT"; // NOI18N
            } else if (source == enterButton) {
                text = "ENTER"; // NOI18N
            } else if (source == escButton) {
                text = "ESCAPE"; // NOI18N
            } else if (source == wheelUpButton) {
                text = "MOUSE_WHEEL_UP"; // NOI18N
            } else if (source == wheelDownButton) {
                text = "MOUSE_WHEEL_DOWN"; // NOI18N
            } else {
                text = ((JButton) source).getText().toUpperCase().replaceAll(" ", "_"); // NOI18N
            }

            //add the text to target textfield
            final String space = " "; //NOI18N
            String scText = target.getText();
            if (scText.length() == 0 || scText.endsWith(space) || scText.endsWith("+")) { // NOI18N
                target.setText(scText + text);
            } else {
                target.setText(scText + space + text);
            }
            // set focus
            target.requestFocus();
        }
    }

}
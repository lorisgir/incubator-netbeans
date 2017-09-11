/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
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
 * Contributor(s):
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
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
 */
package org.netbeans.modules.xml.tax.beans.editor;

import javax.swing.JPanel;

import org.openide.explorer.propertysheet.editors.EnhancedCustomPropertyEditor;

/**
 *
 * @author  Libor Kramolis
 * @version
 */
public class NullStringCustomEditor extends JPanel implements EnhancedCustomPropertyEditor {

    /** Serial Version UID */
    private static final long serialVersionUID =-7120244860529998751L;

    //
    // init
    //

    /** Creates new customizer NullStringCustomEditor */
    public NullStringCustomEditor (NullStringEditor editor) {
        initComponents ();

        textArea.setText (editor.getAsText());
        textArea.setEditable (editor.isEditable());
        
        initAccessibility();
    }


    //
    // EnhancedCustomPropertyEditor
    //

    /**
     * @return Returns the property value that is result of the CustomPropertyEditor.
     * @exception InvalidStateException when the custom property editor does not represent valid property value
     *            (and thus it should not be set)
     */
    public Object getPropertyValue () throws IllegalStateException {
	String text = textArea.getText();

	if ( NullStringEditor.DEFAULT_NULL.equals (text) ) {
	    return null;
	} else if ( text.length() == 0 ) {
	    return null;
	} else {
	    return text;
	}
    }

    //
    // form
    //

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        textAreaScroll = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(6, 6, 6, 6)));
        setPreferredSize(new java.awt.Dimension(350, 230));
        textAreaScroll.setViewportView(textArea);

        add(textAreaScroll, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textAreaScroll;
    // End of variables declaration//GEN-END:variables
    
   /** Initialize accesibility
     */
    public void initAccessibility(){
        
       this.getAccessibleContext().setAccessibleDescription(Util.THIS.getString("ACSD_NullStringCustomEditor"));
       textArea.getAccessibleContext().setAccessibleDescription(Util.THIS.getString("ACSD_textArea")); 
    }
}
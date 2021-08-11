/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.util.QueueLogAppender;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.FocusAdapter;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.util.Collection;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */ import javax.swing.text.BadLocationException;
/*     */ import javax.swing.text.Document;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class zm
/*     */   extends JComponent
/*     */ {
/*  36 */   private static final Font a = new Font("Monospaced", 0, 12);
/*  37 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final zg c;
/*     */   
/*     */   private Thread d;
/*     */   
/*  43 */   private final Collection<Runnable> e = Lists.newArrayList();
/*  44 */   private final AtomicBoolean f = new AtomicBoolean();
/*     */   
/*     */   public static zm a(zg ☃) {
/*     */     try {
/*  48 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*  49 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/*  52 */     JFrame jFrame = new JFrame("Minecraft server");
/*  53 */     zm zm1 = new zm(☃);
/*  54 */     jFrame.setDefaultCloseOperation(2);
/*  55 */     jFrame.add(zm1);
/*  56 */     jFrame.pack();
/*  57 */     jFrame.setLocationRelativeTo((Component)null);
/*  58 */     jFrame.setVisible(true);
/*  59 */     jFrame.addWindowListener(new WindowAdapter(zm1, jFrame, ☃)
/*     */         {
/*     */           public void windowClosing(WindowEvent ☃) {
/*  62 */             if (!zm.a(this.a).getAndSet(true)) {
/*  63 */               this.b.setTitle("Minecraft server - shutting down!");
/*  64 */               this.c.a(true);
/*  65 */               zm.b(this.a);
/*     */             } 
/*     */           }
/*     */         });
/*  69 */     zm1.a(jFrame::dispose);
/*  70 */     zm1.a();
/*  71 */     return zm1;
/*     */   }
/*     */   
/*     */   private zm(zg ☃) {
/*  75 */     this.c = ☃;
/*  76 */     setPreferredSize(new Dimension(854, 480));
/*     */     
/*  78 */     setLayout(new BorderLayout());
/*     */     try {
/*  80 */       add(e(), "Center");
/*  81 */       add(c(), "West");
/*  82 */     } catch (Exception exception) {
/*  83 */       b.error("Couldn't build server GUI", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Runnable ☃) {
/*  88 */     this.e.add(☃);
/*     */   }
/*     */   
/*     */   private JComponent c() {
/*  92 */     JPanel ☃ = new JPanel(new BorderLayout());
/*  93 */     zo zo = new zo(this.c);
/*  94 */     this.e.add(zo::a);
/*  95 */     ☃.add(zo, "North");
/*  96 */     ☃.add(d(), "Center");
/*  97 */     ☃.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
/*  98 */     return ☃;
/*     */   }
/*     */   
/*     */   private JComponent d() {
/* 102 */     JList<?> ☃ = new zn(this.c);
/* 103 */     JScrollPane jScrollPane = new JScrollPane(☃, 22, 30);
/* 104 */     jScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
/*     */     
/* 106 */     return jScrollPane;
/*     */   }
/*     */   
/*     */   private JComponent e() {
/* 110 */     JPanel ☃ = new JPanel(new BorderLayout());
/* 111 */     JTextArea jTextArea = new JTextArea();
/* 112 */     JScrollPane jScrollPane = new JScrollPane(jTextArea, 22, 30);
/* 113 */     jTextArea.setEditable(false);
/* 114 */     jTextArea.setFont(a);
/*     */     
/* 116 */     JTextField jTextField = new JTextField();
/* 117 */     jTextField.addActionListener(actionEvent -> {
/*     */           String str = ☃.getText().trim();
/*     */           
/*     */           if (!str.isEmpty()) {
/*     */             this.c.a(str, this.c.aE());
/*     */           }
/*     */           ☃.setText("");
/*     */         });
/* 125 */     jTextArea.addFocusListener(new FocusAdapter(this)
/*     */         {
/*     */           public void focusGained(FocusEvent ☃) {}
/*     */         });
/*     */ 
/*     */     
/* 131 */     ☃.add(jScrollPane, "Center");
/* 132 */     ☃.add(jTextField, "South");
/* 133 */     ☃.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
/*     */     
/* 135 */     this.d = new Thread(() -> {
/*     */           String str;
/*     */           while ((str = QueueLogAppender.getNextLogEvent("ServerGuiConsole")) != null) {
/*     */             a(☃, jScrollPane, str);
/*     */           }
/*     */         });
/* 141 */     this.d.setUncaughtExceptionHandler(new o(b));
/* 142 */     this.d.setDaemon(true);
/* 143 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/* 147 */     this.d.start();
/*     */   }
/*     */   
/*     */   public void b() {
/* 151 */     if (!this.f.getAndSet(true)) {
/* 152 */       f();
/*     */     }
/*     */   }
/*     */   
/*     */   private void f() {
/* 157 */     this.e.forEach(Runnable::run);
/*     */   }
/*     */   
/*     */   public void a(JTextArea ☃, JScrollPane jScrollPane, String str) {
/* 161 */     if (!SwingUtilities.isEventDispatchThread()) {
/* 162 */       SwingUtilities.invokeLater(() -> a(☃, jScrollPane, str));
/*     */       
/*     */       return;
/*     */     } 
/* 166 */     Document document = ☃.getDocument();
/* 167 */     JScrollBar jScrollBar = jScrollPane.getVerticalScrollBar();
/* 168 */     boolean bool = false;
/*     */     
/* 170 */     if (jScrollPane.getViewport().getView() == ☃) {
/* 171 */       bool = (jScrollBar.getValue() + jScrollBar.getSize().getHeight() + (a.getSize() * 4) > jScrollBar.getMaximum());
/*     */     }
/*     */     
/*     */     try {
/* 175 */       document.insertString(document.getLength(), str, null);
/* 176 */     } catch (BadLocationException badLocationException) {}
/*     */ 
/*     */     
/* 179 */     if (bool)
/* 180 */       jScrollBar.setValue(2147483647); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
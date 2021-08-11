/*    */ import com.google.common.collect.Lists;
/*    */ import java.net.InetAddress;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */ {
/* 23 */   private final List<enh> a = Lists.newArrayList();
/*    */   private boolean b;
/*    */   
/*    */   public synchronized boolean a() {
/* 27 */     return this.b;
/*    */   }
/*    */   
/*    */   public synchronized void b() {
/* 31 */     this.b = false;
/*    */   }
/*    */   
/*    */   public synchronized List<enh> c() {
/* 35 */     return Collections.unmodifiableList(this.a);
/*    */   }
/*    */   
/*    */   public synchronized void a(String ☃, InetAddress inetAddress) {
/* 39 */     String str1 = enj.a(☃);
/* 40 */     String str2 = enj.b(☃);
/* 41 */     if (str2 == null) {
/*    */       return;
/*    */     }
/*    */     
/* 45 */     str2 = inetAddress.getHostAddress() + ":" + str2;
/*    */     
/* 47 */     boolean bool = false;
/* 48 */     for (enh enh : this.a) {
/* 49 */       if (enh.b().equals(str2)) {
/* 50 */         enh.c();
/* 51 */         bool = true;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 56 */     if (!bool) {
/* 57 */       this.a.add(new enh(str1, str2));
/* 58 */       this.b = true;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eni$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
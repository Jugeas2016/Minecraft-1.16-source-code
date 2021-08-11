/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class vs
/*    */   extends PrintStream
/*    */ {
/* 11 */   protected static final Logger a = LogManager.getLogger();
/*    */   
/*    */   protected final String b;
/*    */   
/*    */   public vs(String ☃, OutputStream outputStream) {
/* 16 */     super(outputStream);
/* 17 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void println(@Nullable String ☃) {
/* 22 */     a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void println(Object ☃) {
/* 27 */     a(String.valueOf(☃));
/*    */   }
/*    */   
/*    */   protected void a(@Nullable String ☃) {
/* 31 */     a.info("[{}]: {}", this.b, ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
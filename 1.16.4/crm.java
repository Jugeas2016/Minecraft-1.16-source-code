/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class crm
/*    */   extends cla<cmi>
/*    */ {
/*    */   public crm(Codec<cmi> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmi> a() {
/* 26 */     return a::new;
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmi> {
/*    */     public a(cla<cmi> ☃, int i, int j, cra cra1, int k, long l) {
/* 31 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmi cmi1) {
/* 36 */       int k = i * 16;
/* 37 */       int m = j * 16;
/*    */       
/* 39 */       fx fx = new fx(k, 90, m);
/* 40 */       bzm bzm = bzm.a(this.d);
/* 41 */       crn.a(csw1, fx, bzm, this.b, this.d, cmi1);
/* 42 */       b();
/*    */     }
/*    */   }
/*    */   
/*    */   public enum b implements afs {
/* 47 */     a("warm"),
/* 48 */     b("cold");
/*    */ 
/*    */     
/* 51 */     public static final Codec<b> c = afs.a(b::values, b::a); private static final Map<String, b> d;
/*    */     static {
/* 53 */       d = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*    */     }
/*    */     private final String e;
/*    */     b(String ☃) {
/* 57 */       this.e = ☃;
/*    */     }
/*    */     
/*    */     public String b() {
/* 61 */       return this.e;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public static b a(String ☃) {
/* 66 */       return d.get(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public String a() {
/* 71 */       return this.e;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
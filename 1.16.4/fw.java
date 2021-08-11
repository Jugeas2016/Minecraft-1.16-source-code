/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.EnumMap;
/*    */ import java.util.function.Supplier;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fw
/*    */ {
/* 16 */   private static final Logger c = LogManager.getLogger();
/*    */   static {
/* 18 */     a = x.<EnumMap<gc, f>>a(Maps.newEnumMap(gc.class), ☃ -> {
/*    */           ☃.put(gc.d, f.a());
/*    */           ☃.put(gc.f, new f(null, new d(new g(0.0F, 1.0F, 0.0F), 90.0F, true), null, null));
/*    */           ☃.put(gc.e, new f(null, new d(new g(0.0F, 1.0F, 0.0F), -90.0F, true), null, null));
/*    */           ☃.put(gc.c, new f(null, new d(new g(0.0F, 1.0F, 0.0F), 180.0F, true), null, null));
/*    */           ☃.put(gc.b, new f(null, new d(new g(1.0F, 0.0F, 0.0F), -90.0F, true), null, null));
/*    */           ☃.put(gc.a, new f(null, new d(new g(1.0F, 0.0F, 0.0F), 90.0F, true), null, null));
/*    */         });
/* 26 */     b = x.<EnumMap<gc, f>>a(Maps.newEnumMap(gc.class), ☃ -> {
/*    */           for (gc gc : gc.values())
/*    */             ☃.put(gc, ((f)a.get(gc)).b()); 
/*    */         });
/*    */   }
/*    */   
/*    */   public static final EnumMap<gc, f> a;
/*    */   public static final EnumMap<gc, f> b;
/*    */   
/*    */   public static f a(f ☃) {
/* 36 */     b b = b.b(0.5F, 0.5F, 0.5F);
/* 37 */     b.a(☃.c());
/* 38 */     b.a(b.b(-0.5F, -0.5F, -0.5F));
/* 39 */     return new f(b);
/*    */   }
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
/*    */   public static f a(f ☃, gc gc1, Supplier<String> supplier) {
/* 53 */     gc gc2 = gc.a(☃.c(), gc1);
/* 54 */     f f1 = ☃.b();
/* 55 */     if (f1 == null) {
/* 56 */       c.warn(supplier.get());
/* 57 */       return new f(null, null, new g(0.0F, 0.0F, 0.0F), null);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 62 */     f f2 = ((f)b.get(gc1)).a(f1).a(a.get(gc2));
/*    */     
/* 64 */     return a(f2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
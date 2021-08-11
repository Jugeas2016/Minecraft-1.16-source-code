/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ark
/*    */ {
/*    */   private final Map<arg, arh> a;
/*    */   
/*    */   public ark(Map<arg, arh> ☃) {
/* 16 */     this.a = (Map<arg, arh>)ImmutableMap.copyOf(☃);
/*    */   }
/*    */   
/*    */   private arh d(arg ☃) {
/* 20 */     arh arh = this.a.get(☃);
/* 21 */     if (arh == null) {
/* 22 */       throw new IllegalArgumentException("Can't find attribute " + gm.af.b(☃));
/*    */     }
/* 24 */     return arh;
/*    */   }
/*    */   
/*    */   public double a(arg ☃) {
/* 28 */     return d(☃).f();
/*    */   }
/*    */   
/*    */   public double b(arg ☃) {
/* 32 */     return d(☃).b();
/*    */   }
/*    */   
/*    */   public double a(arg ☃, UUID uUID) {
/* 36 */     arj arj = d(☃).a(uUID);
/* 37 */     if (arj == null) {
/* 38 */       throw new IllegalArgumentException("Can't find modifier " + uUID + " on attribute " + gm.af.b(☃));
/*    */     }
/* 40 */     return arj.d();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public arh a(Consumer<arh> ☃, arg arg1) {
/* 45 */     arh arh1 = this.a.get(arg1);
/* 46 */     if (arh1 == null) {
/* 47 */       return null;
/*    */     }
/* 49 */     arh arh2 = new arh(arg1, ☃);
/* 50 */     arh2.a(arh1);
/* 51 */     return arh2;
/*    */   }
/*    */   
/*    */   public static a a() {
/* 55 */     return new a();
/*    */   }
/*    */   
/*    */   public boolean c(arg ☃) {
/* 59 */     return this.a.containsKey(☃);
/*    */   }
/*    */   
/*    */   public boolean b(arg ☃, UUID uUID) {
/* 63 */     arh arh = this.a.get(☃);
/* 64 */     return (arh != null && arh.a(uUID) != null);
/*    */   }
/*    */   
/*    */   public static class a {
/* 68 */     private final Map<arg, arh> a = Maps.newHashMap();
/*    */     private boolean b;
/*    */     
/*    */     private arh b(arg ☃) {
/* 72 */       arh arh = new arh(☃, arh1 -> {
/*    */             if (this.b) {
/*    */               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + gm.af.b(☃));
/*    */             }
/*    */           });
/* 77 */       this.a.put(☃, arh);
/* 78 */       return arh;
/*    */     }
/*    */     
/*    */     public a a(arg ☃) {
/* 82 */       b(☃);
/* 83 */       return this;
/*    */     }
/*    */     
/*    */     public a a(arg ☃, double d) {
/* 87 */       arh arh = b(☃);
/* 88 */       arh.a(d);
/* 89 */       return this;
/*    */     }
/*    */     
/*    */     public ark a() {
/* 93 */       this.b = true;
/* 94 */       return new ark(this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ark.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
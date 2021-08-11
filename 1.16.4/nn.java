/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class nn
/*    */   implements nx
/*    */ {
/* 12 */   protected final List<nr> a = Lists.newArrayList();
/* 13 */   private afa d = afa.a;
/*    */   
/*    */   @Nullable
/*    */   private ly e;
/* 17 */   private ob f = ob.a;
/*    */ 
/*    */   
/*    */   public nx a(nr ☃) {
/* 21 */     this.a.add(☃);
/* 22 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 27 */     return "";
/*    */   }
/*    */ 
/*    */   
/*    */   public List<nr> b() {
/* 32 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public nx a(ob ☃) {
/* 37 */     this.f = ☃;
/* 38 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public ob c() {
/* 43 */     return this.f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final nx e() {
/* 51 */     nn ☃ = d();
/* 52 */     ☃.a.addAll(this.a);
/* 53 */     ☃.a(this.f);
/* 54 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public afa f() {
/* 59 */     ly ☃ = ly.a();
/* 60 */     if (this.e != ☃) {
/* 61 */       this.d = ☃.a(this);
/* 62 */       this.e = ☃;
/*    */     } 
/* 64 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 69 */     if (this == ☃) {
/* 70 */       return true;
/*    */     }
/*    */     
/* 73 */     if (☃ instanceof nn) {
/* 74 */       nn nn1 = (nn)☃;
/* 75 */       return (this.a.equals(nn1.a) && Objects.equals(c(), nn1.c()));
/*    */     } 
/*    */     
/* 78 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 83 */     return Objects.hash(new Object[] { c(), this.a });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 88 */     return "BaseComponent{style=" + this.f + ", siblings=" + this.a + '}';
/*    */   }
/*    */   
/*    */   public abstract nn d();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */